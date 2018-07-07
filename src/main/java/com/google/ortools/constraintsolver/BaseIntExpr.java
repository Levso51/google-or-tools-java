/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class BaseIntExpr extends IntExpr {
  private transient long swigCPtr;

  protected BaseIntExpr(long cPtr, boolean cMemoryOwn) {
    super(operations_research_constraint_solverJNI.BaseIntExpr_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BaseIntExpr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_BaseIntExpr(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IntVar var() {
    long cPtr = operations_research_constraint_solverJNI.BaseIntExpr_var(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public IntVar CastToVar() {
    long cPtr = operations_research_constraint_solverJNI.BaseIntExpr_CastToVar(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

}
