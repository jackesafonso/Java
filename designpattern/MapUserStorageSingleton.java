package com.fdmgroup.designpattern;



public class MapUserStorageSingleton {

     private static int mapUserId = 0;
     private static MapUserStorageSingleton muss;

     private MapUserStorageSingleton() {
     }

     public static MapUserStorageSingleton getInstance() {

          if (muss == null) {
              muss = new MapUserStorageSingleton();
          }
          return muss;

     }

     public static void setMapUserId(int mapUserIdIn) {
          mapUserId = mapUserIdIn;
     }

     public static int getMapUserId() {
          return mapUserId;
     }

     public static void main(String args[]) {

          MapUserStorageSingleton muss = MapUserStorageSingleton.getInstance();
          muss.setMapUserId(1);

          MapUserStorageSingleton muss1 = MapUserStorageSingleton.getInstance();
          muss.setMapUserId(2);

          System.out.println(muss.getMapUserId());

     }

}

