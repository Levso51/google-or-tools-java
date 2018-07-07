/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class ModelVisitor extends BaseObject {
  private transient long swigCPtr;

  protected ModelVisitor(long cPtr, boolean cMemoryOwn) {
    super(operations_research_constraint_solverJNI.ModelVisitor_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ModelVisitor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_ModelVisitor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static String getKAbs() {
    return operations_research_constraint_solverJNI.ModelVisitor_kAbs_get();
  }

  public static String getKAbsEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kAbsEqual_get();
  }

  public static String getKAllDifferent() {
    return operations_research_constraint_solverJNI.ModelVisitor_kAllDifferent_get();
  }

  public static String getKAllowedAssignments() {
    return operations_research_constraint_solverJNI.ModelVisitor_kAllowedAssignments_get();
  }

  public static String getKAtMost() {
    return operations_research_constraint_solverJNI.ModelVisitor_kAtMost_get();
  }

  public static String getKIndexOf() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIndexOf_get();
  }

  public static String getKBetween() {
    return operations_research_constraint_solverJNI.ModelVisitor_kBetween_get();
  }

  public static String getKConditionalExpr() {
    return operations_research_constraint_solverJNI.ModelVisitor_kConditionalExpr_get();
  }

  public static String getKCircuit() {
    return operations_research_constraint_solverJNI.ModelVisitor_kCircuit_get();
  }

  public static String getKConvexPiecewise() {
    return operations_research_constraint_solverJNI.ModelVisitor_kConvexPiecewise_get();
  }

  public static String getKCountEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kCountEqual_get();
  }

  public static String getKCover() {
    return operations_research_constraint_solverJNI.ModelVisitor_kCover_get();
  }

  public static String getKCumulative() {
    return operations_research_constraint_solverJNI.ModelVisitor_kCumulative_get();
  }

  public static String getKDeviation() {
    return operations_research_constraint_solverJNI.ModelVisitor_kDeviation_get();
  }

  public static String getKDifference() {
    return operations_research_constraint_solverJNI.ModelVisitor_kDifference_get();
  }

  public static String getKDisjunctive() {
    return operations_research_constraint_solverJNI.ModelVisitor_kDisjunctive_get();
  }

  public static String getKDistribute() {
    return operations_research_constraint_solverJNI.ModelVisitor_kDistribute_get();
  }

  public static String getKDivide() {
    return operations_research_constraint_solverJNI.ModelVisitor_kDivide_get();
  }

  public static String getKDurationExpr() {
    return operations_research_constraint_solverJNI.ModelVisitor_kDurationExpr_get();
  }

  public static String getKElement() {
    return operations_research_constraint_solverJNI.ModelVisitor_kElement_get();
  }

  public static String getKElementEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kElementEqual_get();
  }

  public static String getKEndExpr() {
    return operations_research_constraint_solverJNI.ModelVisitor_kEndExpr_get();
  }

  public static String getKEquality() {
    return operations_research_constraint_solverJNI.ModelVisitor_kEquality_get();
  }

  public static String getKFalseConstraint() {
    return operations_research_constraint_solverJNI.ModelVisitor_kFalseConstraint_get();
  }

  public static String getKGlobalCardinality() {
    return operations_research_constraint_solverJNI.ModelVisitor_kGlobalCardinality_get();
  }

  public static String getKGreater() {
    return operations_research_constraint_solverJNI.ModelVisitor_kGreater_get();
  }

  public static String getKGreaterOrEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kGreaterOrEqual_get();
  }

  public static String getKIntegerVariable() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIntegerVariable_get();
  }

  public static String getKIntervalBinaryRelation() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIntervalBinaryRelation_get();
  }

  public static String getKIntervalDisjunction() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIntervalDisjunction_get();
  }

  public static String getKIntervalUnaryRelation() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIntervalUnaryRelation_get();
  }

  public static String getKIntervalVariable() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIntervalVariable_get();
  }

  public static String getKInversePermutation() {
    return operations_research_constraint_solverJNI.ModelVisitor_kInversePermutation_get();
  }

  public static String getKIsBetween() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIsBetween_get();
  }

  public static String getKIsDifferent() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIsDifferent_get();
  }

  public static String getKIsEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIsEqual_get();
  }

  public static String getKIsGreater() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIsGreater_get();
  }

  public static String getKIsGreaterOrEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIsGreaterOrEqual_get();
  }

  public static String getKIsLess() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIsLess_get();
  }

  public static String getKIsLessOrEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIsLessOrEqual_get();
  }

  public static String getKIsMember() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIsMember_get();
  }

  public static String getKLess() {
    return operations_research_constraint_solverJNI.ModelVisitor_kLess_get();
  }

  public static String getKLessOrEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kLessOrEqual_get();
  }

  public static String getKLexLess() {
    return operations_research_constraint_solverJNI.ModelVisitor_kLexLess_get();
  }

  public static String getKLinkExprVar() {
    return operations_research_constraint_solverJNI.ModelVisitor_kLinkExprVar_get();
  }

  public static String getKMapDomain() {
    return operations_research_constraint_solverJNI.ModelVisitor_kMapDomain_get();
  }

  public static String getKMax() {
    return operations_research_constraint_solverJNI.ModelVisitor_kMax_get();
  }

  public static String getKMaxEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kMaxEqual_get();
  }

  public static String getKMember() {
    return operations_research_constraint_solverJNI.ModelVisitor_kMember_get();
  }

  public static String getKMin() {
    return operations_research_constraint_solverJNI.ModelVisitor_kMin_get();
  }

  public static String getKMinEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kMinEqual_get();
  }

  public static String getKModulo() {
    return operations_research_constraint_solverJNI.ModelVisitor_kModulo_get();
  }

  public static String getKNoCycle() {
    return operations_research_constraint_solverJNI.ModelVisitor_kNoCycle_get();
  }

  public static String getKNonEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kNonEqual_get();
  }

  public static String getKNotBetween() {
    return operations_research_constraint_solverJNI.ModelVisitor_kNotBetween_get();
  }

  public static String getKNotMember() {
    return operations_research_constraint_solverJNI.ModelVisitor_kNotMember_get();
  }

  public static String getKNullIntersect() {
    return operations_research_constraint_solverJNI.ModelVisitor_kNullIntersect_get();
  }

  public static String getKOpposite() {
    return operations_research_constraint_solverJNI.ModelVisitor_kOpposite_get();
  }

  public static String getKPack() {
    return operations_research_constraint_solverJNI.ModelVisitor_kPack_get();
  }

  public static String getKPathCumul() {
    return operations_research_constraint_solverJNI.ModelVisitor_kPathCumul_get();
  }

  public static String getKDelayedPathCumul() {
    return operations_research_constraint_solverJNI.ModelVisitor_kDelayedPathCumul_get();
  }

  public static String getKPerformedExpr() {
    return operations_research_constraint_solverJNI.ModelVisitor_kPerformedExpr_get();
  }

  public static String getKPower() {
    return operations_research_constraint_solverJNI.ModelVisitor_kPower_get();
  }

  public static String getKProduct() {
    return operations_research_constraint_solverJNI.ModelVisitor_kProduct_get();
  }

  public static String getKScalProd() {
    return operations_research_constraint_solverJNI.ModelVisitor_kScalProd_get();
  }

  public static String getKScalProdEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kScalProdEqual_get();
  }

  public static String getKScalProdGreaterOrEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kScalProdGreaterOrEqual_get();
  }

  public static String getKScalProdLessOrEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kScalProdLessOrEqual_get();
  }

  public static String getKSemiContinuous() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSemiContinuous_get();
  }

  public static String getKSequenceVariable() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSequenceVariable_get();
  }

  public static String getKSortingConstraint() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSortingConstraint_get();
  }

  public static String getKSquare() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSquare_get();
  }

  public static String getKStartExpr() {
    return operations_research_constraint_solverJNI.ModelVisitor_kStartExpr_get();
  }

  public static String getKSum() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSum_get();
  }

  public static String getKSumEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSumEqual_get();
  }

  public static String getKSumGreaterOrEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSumGreaterOrEqual_get();
  }

  public static String getKSumLessOrEqual() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSumLessOrEqual_get();
  }

  public static String getKTrace() {
    return operations_research_constraint_solverJNI.ModelVisitor_kTrace_get();
  }

  public static String getKTransition() {
    return operations_research_constraint_solverJNI.ModelVisitor_kTransition_get();
  }

  public static String getKTrueConstraint() {
    return operations_research_constraint_solverJNI.ModelVisitor_kTrueConstraint_get();
  }

  public static String getKVarBoundWatcher() {
    return operations_research_constraint_solverJNI.ModelVisitor_kVarBoundWatcher_get();
  }

  public static String getKVarValueWatcher() {
    return operations_research_constraint_solverJNI.ModelVisitor_kVarValueWatcher_get();
  }

  public static String getKCountAssignedItemsExtension() {
    return operations_research_constraint_solverJNI.ModelVisitor_kCountAssignedItemsExtension_get();
  }

  public static String getKCountUsedBinsExtension() {
    return operations_research_constraint_solverJNI.ModelVisitor_kCountUsedBinsExtension_get();
  }

  public static String getKInt64ToBoolExtension() {
    return operations_research_constraint_solverJNI.ModelVisitor_kInt64ToBoolExtension_get();
  }

  public static String getKInt64ToInt64Extension() {
    return operations_research_constraint_solverJNI.ModelVisitor_kInt64ToInt64Extension_get();
  }

  public static String getKObjectiveExtension() {
    return operations_research_constraint_solverJNI.ModelVisitor_kObjectiveExtension_get();
  }

  public static String getKSearchLimitExtension() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSearchLimitExtension_get();
  }

  public static String getKUsageEqualVariableExtension() {
    return operations_research_constraint_solverJNI.ModelVisitor_kUsageEqualVariableExtension_get();
  }

  public static String getKUsageLessConstantExtension() {
    return operations_research_constraint_solverJNI.ModelVisitor_kUsageLessConstantExtension_get();
  }

  public static String getKVariableGroupExtension() {
    return operations_research_constraint_solverJNI.ModelVisitor_kVariableGroupExtension_get();
  }

  public static String getKVariableUsageLessConstantExtension() {
    return operations_research_constraint_solverJNI.ModelVisitor_kVariableUsageLessConstantExtension_get();
  }

  public static String getKWeightedSumOfAssignedEqualVariableExtension() {
    return operations_research_constraint_solverJNI.ModelVisitor_kWeightedSumOfAssignedEqualVariableExtension_get();
  }

  public static String getKActiveArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kActiveArgument_get();
  }

  public static String getKAssumePathsArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kAssumePathsArgument_get();
  }

  public static String getKBranchesLimitArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kBranchesLimitArgument_get();
  }

  public static String getKCapacityArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kCapacityArgument_get();
  }

  public static String getKCardsArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kCardsArgument_get();
  }

  public static String getKCoefficientsArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kCoefficientsArgument_get();
  }

  public static String getKCountArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kCountArgument_get();
  }

  public static String getKCumulativeArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kCumulativeArgument_get();
  }

  public static String getKCumulsArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kCumulsArgument_get();
  }

  public static String getKDemandsArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kDemandsArgument_get();
  }

  public static String getKDurationMaxArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kDurationMaxArgument_get();
  }

  public static String getKDurationMinArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kDurationMinArgument_get();
  }

  public static String getKEarlyCostArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kEarlyCostArgument_get();
  }

  public static String getKEarlyDateArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kEarlyDateArgument_get();
  }

  public static String getKEndMaxArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kEndMaxArgument_get();
  }

  public static String getKEndMinArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kEndMinArgument_get();
  }

  public static String getKEndsArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kEndsArgument_get();
  }

  public static String getKExpressionArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kExpressionArgument_get();
  }

  public static String getKFailuresLimitArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kFailuresLimitArgument_get();
  }

  public static String getKFinalStatesArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kFinalStatesArgument_get();
  }

  public static String getKFixedChargeArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kFixedChargeArgument_get();
  }

  public static String getKIndex2Argument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIndex2Argument_get();
  }

  public static String getKIndexArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIndexArgument_get();
  }

  public static String getKInitialState() {
    return operations_research_constraint_solverJNI.ModelVisitor_kInitialState_get();
  }

  public static String getKIntervalArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIntervalArgument_get();
  }

  public static String getKIntervalsArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kIntervalsArgument_get();
  }

  public static String getKLateCostArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kLateCostArgument_get();
  }

  public static String getKLateDateArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kLateDateArgument_get();
  }

  public static String getKLeftArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kLeftArgument_get();
  }

  public static String getKMaxArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kMaxArgument_get();
  }

  public static String getKMaximizeArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kMaximizeArgument_get();
  }

  public static String getKMinArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kMinArgument_get();
  }

  public static String getKModuloArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kModuloArgument_get();
  }

  public static String getKNextsArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kNextsArgument_get();
  }

  public static String getKOptionalArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kOptionalArgument_get();
  }

  public static String getKPartialArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kPartialArgument_get();
  }

  public static String getKPositionXArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kPositionXArgument_get();
  }

  public static String getKPositionYArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kPositionYArgument_get();
  }

  public static String getKRangeArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kRangeArgument_get();
  }

  public static String getKRelationArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kRelationArgument_get();
  }

  public static String getKRightArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kRightArgument_get();
  }

  public static String getKSequenceArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSequenceArgument_get();
  }

  public static String getKSequencesArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSequencesArgument_get();
  }

  public static String getKSizeArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSizeArgument_get();
  }

  public static String getKSizeXArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSizeXArgument_get();
  }

  public static String getKSizeYArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSizeYArgument_get();
  }

  public static String getKSmartTimeCheckArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSmartTimeCheckArgument_get();
  }

  public static String getKSolutionLimitArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSolutionLimitArgument_get();
  }

  public static String getKStartMaxArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kStartMaxArgument_get();
  }

  public static String getKStartMinArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kStartMinArgument_get();
  }

  public static String getKStartsArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kStartsArgument_get();
  }

  public static String getKStepArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kStepArgument_get();
  }

  public static String getKTargetArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kTargetArgument_get();
  }

  public static String getKTimeLimitArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kTimeLimitArgument_get();
  }

  public static String getKTransitsArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kTransitsArgument_get();
  }

  public static String getKTuplesArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kTuplesArgument_get();
  }

  public static String getKValueArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kValueArgument_get();
  }

  public static String getKValuesArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kValuesArgument_get();
  }

  public static String getKVariableArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kVariableArgument_get();
  }

  public static String getKVarsArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kVarsArgument_get();
  }

  public static String getKEvaluatorArgument() {
    return operations_research_constraint_solverJNI.ModelVisitor_kEvaluatorArgument_get();
  }

  public static String getKMirrorOperation() {
    return operations_research_constraint_solverJNI.ModelVisitor_kMirrorOperation_get();
  }

  public static String getKRelaxedMaxOperation() {
    return operations_research_constraint_solverJNI.ModelVisitor_kRelaxedMaxOperation_get();
  }

  public static String getKRelaxedMinOperation() {
    return operations_research_constraint_solverJNI.ModelVisitor_kRelaxedMinOperation_get();
  }

  public static String getKSumOperation() {
    return operations_research_constraint_solverJNI.ModelVisitor_kSumOperation_get();
  }

  public static String getKDifferenceOperation() {
    return operations_research_constraint_solverJNI.ModelVisitor_kDifferenceOperation_get();
  }

  public static String getKProductOperation() {
    return operations_research_constraint_solverJNI.ModelVisitor_kProductOperation_get();
  }

  public static String getKStartSyncOnStartOperation() {
    return operations_research_constraint_solverJNI.ModelVisitor_kStartSyncOnStartOperation_get();
  }

  public static String getKStartSyncOnEndOperation() {
    return operations_research_constraint_solverJNI.ModelVisitor_kStartSyncOnEndOperation_get();
  }

  public static String getKTraceOperation() {
    return operations_research_constraint_solverJNI.ModelVisitor_kTraceOperation_get();
  }

  public void BeginVisitModel(String solver_name) {
    operations_research_constraint_solverJNI.ModelVisitor_BeginVisitModel(swigCPtr, this, solver_name);
  }

  public void EndVisitModel(String solver_name) {
    operations_research_constraint_solverJNI.ModelVisitor_EndVisitModel(swigCPtr, this, solver_name);
  }

  public void BeginVisitConstraint(String type_name, Constraint constraint) {
    operations_research_constraint_solverJNI.ModelVisitor_BeginVisitConstraint(swigCPtr, this, type_name, Constraint.getCPtr(constraint), constraint);
  }

  public void EndVisitConstraint(String type_name, Constraint constraint) {
    operations_research_constraint_solverJNI.ModelVisitor_EndVisitConstraint(swigCPtr, this, type_name, Constraint.getCPtr(constraint), constraint);
  }

  public void BeginVisitExtension(String type) {
    operations_research_constraint_solverJNI.ModelVisitor_BeginVisitExtension(swigCPtr, this, type);
  }

  public void EndVisitExtension(String type) {
    operations_research_constraint_solverJNI.ModelVisitor_EndVisitExtension(swigCPtr, this, type);
  }

  public void BeginVisitIntegerExpression(String type_name, IntExpr expr) {
    operations_research_constraint_solverJNI.ModelVisitor_BeginVisitIntegerExpression(swigCPtr, this, type_name, IntExpr.getCPtr(expr), expr);
  }

  public void EndVisitIntegerExpression(String type_name, IntExpr expr) {
    operations_research_constraint_solverJNI.ModelVisitor_EndVisitIntegerExpression(swigCPtr, this, type_name, IntExpr.getCPtr(expr), expr);
  }

  public void VisitIntegerVariable(IntVar variable, IntExpr delegate) {
    operations_research_constraint_solverJNI.ModelVisitor_VisitIntegerVariable__SWIG_0(swigCPtr, this, IntVar.getCPtr(variable), variable, IntExpr.getCPtr(delegate), delegate);
  }

  public void VisitIntegerVariable(IntVar variable, String operation, long value, IntVar delegate) {
    operations_research_constraint_solverJNI.ModelVisitor_VisitIntegerVariable__SWIG_1(swigCPtr, this, IntVar.getCPtr(variable), variable, operation, value, IntVar.getCPtr(delegate), delegate);
  }

  public void VisitIntervalVariable(IntervalVar variable, String operation, long value, IntervalVar delegate) {
    operations_research_constraint_solverJNI.ModelVisitor_VisitIntervalVariable(swigCPtr, this, IntervalVar.getCPtr(variable), variable, operation, value, IntervalVar.getCPtr(delegate), delegate);
  }

  public void VisitSequenceVariable(SequenceVar variable) {
    operations_research_constraint_solverJNI.ModelVisitor_VisitSequenceVariable(swigCPtr, this, SequenceVar.getCPtr(variable), variable);
  }

  public void VisitIntegerArgument(String arg_name, long value) {
    operations_research_constraint_solverJNI.ModelVisitor_VisitIntegerArgument(swigCPtr, this, arg_name, value);
  }

  public void VisitIntegerArrayArgument(String arg_name, long[] values) {
    operations_research_constraint_solverJNI.ModelVisitor_VisitIntegerArrayArgument(swigCPtr, this, arg_name, values);
  }

  public void VisitIntegerMatrixArgument(String arg_name, IntTupleSet tuples) {
    operations_research_constraint_solverJNI.ModelVisitor_VisitIntegerMatrixArgument(swigCPtr, this, arg_name, IntTupleSet.getCPtr(tuples), tuples);
  }

  public void VisitIntegerExpressionArgument(String arg_name, IntExpr argument) {
    operations_research_constraint_solverJNI.ModelVisitor_VisitIntegerExpressionArgument(swigCPtr, this, arg_name, IntExpr.getCPtr(argument), argument);
  }

  public void VisitIntegerVariableArrayArgument(String arg_name, IntVar[] arguments) {
    operations_research_constraint_solverJNI.ModelVisitor_VisitIntegerVariableArrayArgument(swigCPtr, this, arg_name, arguments);
  }

  public void VisitIntervalArgument(String arg_name, IntervalVar argument) {
    operations_research_constraint_solverJNI.ModelVisitor_VisitIntervalArgument(swigCPtr, this, arg_name, IntervalVar.getCPtr(argument), argument);
  }

  public void VisitIntervalArrayArgument(String arg_name, IntervalVar[] arguments) {
    operations_research_constraint_solverJNI.ModelVisitor_VisitIntervalArrayArgument(swigCPtr, this, arg_name, arguments);
  }

  public void VisitSequenceArgument(String arg_name, SequenceVar argument) {
    operations_research_constraint_solverJNI.ModelVisitor_VisitSequenceArgument(swigCPtr, this, arg_name, SequenceVar.getCPtr(argument), argument);
  }

  public void VisitSequenceArrayArgument(String arg_name, SequenceVar[] arguments) {
    operations_research_constraint_solverJNI.ModelVisitor_VisitSequenceArrayArgument(swigCPtr, this, arg_name, arguments);
  }

  public ModelVisitor() {
    this(operations_research_constraint_solverJNI.new_ModelVisitor(), true);
  }

}
