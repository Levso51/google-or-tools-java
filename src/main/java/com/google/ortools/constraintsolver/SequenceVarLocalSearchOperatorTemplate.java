/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class SequenceVarLocalSearchOperatorTemplate extends LocalSearchOperator {
  private transient long swigCPtr;

  protected SequenceVarLocalSearchOperatorTemplate(long cPtr, boolean cMemoryOwn) {
    super(operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SequenceVarLocalSearchOperatorTemplate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_SequenceVarLocalSearchOperatorTemplate(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void start(Assignment assignment) {
    operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_start(swigCPtr, this, Assignment.getCPtr(assignment), assignment);
  }

  public boolean isIncremental() {
    return operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_isIncremental(swigCPtr, this);
  }

  public int size() {
    return operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_size(swigCPtr, this);
  }

  public int[] value(long index) {
  return operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_value(swigCPtr, this, index);
}

  public SequenceVar var(long index) {
    long cPtr = operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_var(swigCPtr, this, index);
    return (cPtr == 0) ? null : new SequenceVar(cPtr, false);
  }

  public boolean SkipUnchanged(int index) {
    return operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_SkipUnchanged(swigCPtr, this, index);
  }

  public int[] oldValue(long index) {
  return operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_oldValue(swigCPtr, this, index);
}

  public void setValue(long index, int[] value) {
    operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_setValue(swigCPtr, this, index, value);
  }

  public boolean activated(long index) {
    return operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_activated(swigCPtr, this, index);
  }

  public void activate(long index) {
    operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_activate(swigCPtr, this, index);
  }

  public void deactivate(long index) {
    operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_deactivate(swigCPtr, this, index);
  }

  public boolean ApplyChanges(Assignment delta, Assignment deltadelta) {
    return operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_ApplyChanges(swigCPtr, this, Assignment.getCPtr(delta), delta, Assignment.getCPtr(deltadelta), deltadelta);
  }

  public void RevertChanges(boolean incremental) {
    operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_RevertChanges(swigCPtr, this, incremental);
  }

  public void addVars(SequenceVar[] vars) {
    operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_addVars(swigCPtr, this, vars);
  }

  public void onStart() {
    operations_research_constraint_solverJNI.SequenceVarLocalSearchOperatorTemplate_onStart(swigCPtr, this);
  }

}
