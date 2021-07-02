package com.company.OOPS.IndustryDemonstration;

/** Interface for all the web facing objects **/
public interface WebObject {
  
  /** Abstract method declaration. No need for access modifier, by default public. **/
  String getUUID();
}

// ony static and default variables allowed
//only static and default method implementation allowed.
/** interfaces are the contract for concrete classes. classes which implent interface must implement all
 the abstarct methods defined in interface. **/