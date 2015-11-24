package edu.umass.cs.client.cluster;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 * Created by snoran on 11/1/15.
 *
 * DBScan clustering implementation. Given a set of points, the DBScan algorithm assigns each point to
 * a cluster such that for any point P in cluster C, each neighbors P' of P is added to C if P has
 * at least {@link #minPts} neighbors. A point Q is considered a neighbor of P if {@code distance(P,Q)} is
 * at most {@link #eps}. Additionally, points may be marked as noise, meaning they fall in no cluster.
 */
public class DBScan<T extends Clusterable<T>> {

    /** Radius of the neighborhood for expanding clusters */
    private final double eps;

    /** Minimum number of points in a cluster. */
    private final int minPts;

    /**
     * @param eps radius of the neighborhood for expanding clusters
     * @param minPts minimum number of points in a cluster
     */
    public DBScan(final double eps, final int minPts){
        this.eps = eps;
        this.minPts = minPts;
    }

    /** The state of a point - is it in a cluster or has it been marked as noise? */
    private enum State {
        /** The point has been visited, but not marked as NOISE or CLUSTERED yet */
        VISITED,
        /** The point has not yet been visited */
        UNVISITED,
        /** The point has been visited and has determined to be noise (no cluster) */
        NOISE,
        /** The point has been assigned to a cluster. */
        CLUSTERED
    }

    /**
     * Returns the radius of the neighborhood for expanding clusters
     * @return epsilon
     */
    public double getEps() {
        return eps;
    }

    /**
     * Returns the minimum number of points in a cluster
     * @return minPts
     */
    public int getMinPts() {
        return minPts;
    }

    /**
     * DBScan clustering algorithm. See the slides for pseudocode and the class documentation for a detailed description.
     * <p>
     * This method will return a list of clusters. Each {@link Cluster} contains a list of points that
     * belong to that cluster. DBScan does not return cluster centers. To find the center, simply
     * average over the points.
     * </p>
     * <p>
     * Points must be valid for clustering - that is a subclass of {@link Clusterable}. This is so that
     * we can compute the distance as defined by {@link Clusterable#distance(Object)}.
     * </p>
     *
     * @param points the list of points we want to cluster
     * @return a list of clusters
     *
     * @see Cluster
     * @see Clusterable
     * @see #eps
     * @see #minPts
     */
    public List<Cluster<T>> cluster(final Collection<T> points) {
        List<Cluster<T>> clusters = new ArrayList<Cluster<T>>();
        Map<T, State> states = new HashMap<T, State>();

        // initialize all points' state to UNVISITED
        for (final T p : points) {
            states.put(p, State.UNVISITED);
        }

        // create the list of clusters from the list of points
        Cluster<T> c = null;
        for (final T p : points) {
            if (states.get(p) == State.UNVISITED) {     // for all unvisited points
                List<T> neighbors = regionQuery(p, points);

                if (neighbors.size() < minPts) {        // that do not have a low density
                    states.put(p, State.NOISE);
                } else {                                // perform clustering
                    c = new Cluster<T>();
                    expandCluster(c, p, states, neighbors, points);
                    clusters.add(c);
                }
            }
        }

        return clusters;
    }

    /**
     * Expands the cluster to include reachable points within {@link #eps}
     * satisfying a local density defined by {@link #minPts}.
     *
     * @param cluster the cluster to expand
     * @param p Point to add to cluster
     * @param states a map from points to true or false,
     *                indicating whether the point has been visited
     * @param neighborPts the list of neighboring points
     * @param points the set of all points
     */
    private void expandCluster(Cluster<T> cluster, final T p, final Map<T, State> states,
                                     final List<T> neighborPts, final Collection<T> points) {

        /**
         *  expandCluster(P, NeighborPts, C, eps, MinPts)
         *      add P to cluster C
         *      for each point P' in NeighborPts
         *          if P' is not visited
         *              mark P' as visited
         *              NeighborPts' = regionQuery(P', eps)
         *              if sizeof(NeighborPts') >= MinPts
         *                  NeighborPts = NeighborPts joined with NeighborPts'
         *          if P' is not yet member of any cluster
         *              add P' to cluster C
         */

        cluster.addPoint(p);                                    // add core point
        states.put(p, State.CLUSTERED);

        for (int i=0; i<neighborPts.size(); i++) {
            T neighbor = neighborPts.get(i);
            State neighborState = states.get(neighbor);
            if (neighborState == State.UNVISITED) {             // for each unvisited neighbor
                states.put(neighbor, State.VISITED);
                List<T> neighborNeighborPts = regionQuery(neighbor, neighborPts);
                if (neighborNeighborPts.size() >= minPts) {     // that does not have a low density
                    for (T nnp : neighborNeighborPts) {
                        if(!neighborPts.contains(nnp))
                            neighborPts.add(nnp);
                    }
                }
            }
            if (states.get(neighbor) != State.CLUSTERED) {             // if neighbor does not have cluster
                cluster.addPoint(neighbor);                     // add to the cluster
                states.put(p, State.CLUSTERED);
            }
        }
    }

    /**
     * Returns a list of neighbors within {@link #eps} of the given point.
     *
     * @param p the point of interest
     * @param points all candidate neighboring points
     * @return a list of neighbors
     * @see Clusterable#distance(Object)
     */
    private List<T> regionQuery(final T p, final Collection<T> points) {
        final List<T> neighbors = new ArrayList<T>();
        for (T point : points) {
            if (p.distance(point) <= eps)
                neighbors.add(point);
        }
        return neighbors;
    }

    /**
     * Adds all the items in list2 to list1 that are not already contained in list1. It's
     * important that we don't have repeats in our clusters
     * @param list1 the first list of points
     * @param list2 the second list of points
     */
    private void addAsSet(List<T> list1, final List<T> list2) {
        for (T p : list2) {
            if (!list1.contains(p)) {
                list1.add(p);
            }
        }
    }
}
