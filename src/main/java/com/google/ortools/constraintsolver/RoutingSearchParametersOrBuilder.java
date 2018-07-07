// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/constraint_solver/routing_parameters.proto

package com.google.ortools.constraintsolver;

public interface RoutingSearchParametersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:operations_research.RoutingSearchParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * First solution strategies, used as starting point of local search.
   * </pre>
   *
   * <code>.operations_research.FirstSolutionStrategy.Value first_solution_strategy = 1;</code>
   */
  int getFirstSolutionStrategyValue();
  /**
   * <pre>
   * First solution strategies, used as starting point of local search.
   * </pre>
   *
   * <code>.operations_research.FirstSolutionStrategy.Value first_solution_strategy = 1;</code>
   */
  com.google.ortools.constraintsolver.FirstSolutionStrategy.Value getFirstSolutionStrategy();

  /**
   * <pre>
   * These are advanced first solutions strategy settings which should not be
   * modified unless you know what you are doing.
   * Use filtered version of first solution strategy if available.
   * </pre>
   *
   * <code>bool use_filtered_first_solution_strategy = 2;</code>
   */
  boolean getUseFilteredFirstSolutionStrategy();

  /**
   * <pre>
   * Parameters specific to the Savings first solution heuristic.
   * Ratio (between 0 and 1) of neighbors to consider for each node when
   * constructing the savings. If &lt;= 0 or greater than 1, its value is
   * considered to be 1.0.
   * </pre>
   *
   * <code>double savings_neighbors_ratio = 14;</code>
   */
  double getSavingsNeighborsRatio();

  /**
   * <pre>
   * Add savings related to reverse arcs when finding the nearest neighbors
   * of the nodes.
   * </pre>
   *
   * <code>bool savings_add_reverse_arcs = 15;</code>
   */
  boolean getSavingsAddReverseArcs();

  /**
   * <code>.operations_research.RoutingSearchParameters.LocalSearchNeighborhoodOperators local_search_operators = 3;</code>
   */
  boolean hasLocalSearchOperators();
  /**
   * <code>.operations_research.RoutingSearchParameters.LocalSearchNeighborhoodOperators local_search_operators = 3;</code>
   */
  com.google.ortools.constraintsolver.RoutingSearchParameters.LocalSearchNeighborhoodOperators getLocalSearchOperators();
  /**
   * <code>.operations_research.RoutingSearchParameters.LocalSearchNeighborhoodOperators local_search_operators = 3;</code>
   */
  com.google.ortools.constraintsolver.RoutingSearchParameters.LocalSearchNeighborhoodOperatorsOrBuilder getLocalSearchOperatorsOrBuilder();

  /**
   * <pre>
   * Local search metaheuristics used to guide the search.
   * </pre>
   *
   * <code>.operations_research.LocalSearchMetaheuristic.Value local_search_metaheuristic = 4;</code>
   */
  int getLocalSearchMetaheuristicValue();
  /**
   * <pre>
   * Local search metaheuristics used to guide the search.
   * </pre>
   *
   * <code>.operations_research.LocalSearchMetaheuristic.Value local_search_metaheuristic = 4;</code>
   */
  com.google.ortools.constraintsolver.LocalSearchMetaheuristic.Value getLocalSearchMetaheuristic();

  /**
   * <pre>
   * These are advanced settings which should not be modified unless you know
   * what you are doing.
   * Lambda coefficient used to penalize arc costs when GUIDED_LOCAL_SEARCH is
   * used.
   * </pre>
   *
   * <code>double guided_local_search_lambda_coefficient = 5;</code>
   */
  double getGuidedLocalSearchLambdaCoefficient();

  /**
   * <pre>
   * --- Search control ---
   * If true, the solver should use depth-first search rather than local search
   * to solve the problem.
   * </pre>
   *
   * <code>bool use_depth_first_search = 6;</code>
   */
  boolean getUseDepthFirstSearch();

  /**
   * <pre>
   * Minimum step by which the solution must be improved in local search.
   * </pre>
   *
   * <code>int64 optimization_step = 7;</code>
   */
  long getOptimizationStep();

  /**
   * <pre>
   * -- Search limits --
   * Limit to the number of solutions generated during the search.
   * </pre>
   *
   * <code>int64 solution_limit = 8;</code>
   */
  long getSolutionLimit();

  /**
   * <pre>
   * Limit in milliseconds to the time spent in the search.
   * </pre>
   *
   * <code>int64 time_limit_ms = 9;</code>
   */
  long getTimeLimitMs();

  /**
   * <pre>
   * Limit in milliseconds to the time spent in the completion search for each
   * local search neighbor.
   * </pre>
   *
   * <code>int64 lns_time_limit_ms = 10;</code>
   */
  long getLnsTimeLimitMs();

  /**
   * <pre>
   * --- Propagation control ---
   * These are advanced settings which should not be modified unless you know
   * what you are doing.
   * Use constraints with light propagation in routing model. Extra propagation
   * is only necessary when using depth-first search or for models which
   * require strong propagation to finalize the value of secondary variables.
   * Changing this setting to true will slow down the search in most cases and
   * increase memory consumption in all cases.
   * </pre>
   *
   * <code>bool use_light_propagation = 11;</code>
   */
  boolean getUseLightPropagation();

  /**
   * <pre>
   * --- Miscellaneous ---
   * Some of these are advanced settings which should not be modified unless you
   * know what you are doing.
   * If true, arc cost evaluators will be fingerprinted. The fingerprint will
   * be used when computing vehicle cost equivalent classes, otherwise the
   * address of the evaluator will be used.
   * </pre>
   *
   * <code>bool fingerprint_arc_cost_evaluators = 12;</code>
   */
  boolean getFingerprintArcCostEvaluators();

  /**
   * <pre>
   * Activates search logging. For each solution found during the search, the
   * following will be displayed: its objective value, the maximum objective
   * value since the beginning of the search, the elapsed time since the
   * beginning of the search, the number of branches explored in the search
   * tree, the number of failures in the search tree, the depth of the search
   * tree, the number of local search neighbors explored, the number of local
   * search neighbors filtered by local search filters, the number of local
   * search neighbors accepted, the total memory used and the percentage of the
   * search done.
   * </pre>
   *
   * <code>bool log_search = 13;</code>
   */
  boolean getLogSearch();
}
