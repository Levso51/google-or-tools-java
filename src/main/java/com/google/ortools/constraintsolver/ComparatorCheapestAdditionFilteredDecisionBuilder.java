/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class ComparatorCheapestAdditionFilteredDecisionBuilder extends CheapestAdditionFilteredDecisionBuilder {
  private transient long swigCPtr;

  protected ComparatorCheapestAdditionFilteredDecisionBuilder(long cPtr, boolean cMemoryOwn) {
    super(operations_research_constraint_solverJNI.ComparatorCheapestAdditionFilteredDecisionBuilder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ComparatorCheapestAdditionFilteredDecisionBuilder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_ComparatorCheapestAdditionFilteredDecisionBuilder(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

}
