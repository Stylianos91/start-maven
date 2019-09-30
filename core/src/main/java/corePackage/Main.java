package corePackage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger log = LoggerFactory.getLogger(Main.class);
  public static void main(String[] args) {
    System.out.println("Start up Maven!!");
    log.info("Hello core info");
    log.debug("Hello debug");
  }
}