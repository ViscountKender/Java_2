package ru.geekbrains.java_2;

import java.util.*;

public class Phonebook {

  public Phonebook() {

  }

  private HashMap<String,String> pb = new HashMap<>();

  void add(  String surname, String number){

    pb.put( number,surname);
    System.out.println(pb);

  }
  void get(String surname ){
    if(pb.containsValue(surname)){
      Set<Map.Entry<String, String>> set = pb.entrySet();
      for (Map.Entry<String, String> temp : set) {
        if(temp.getValue().equals(surname)) {
          System.out.println(temp.getValue() + " : " + temp.getKey());
        }
      }
    } else {
      System.out.println("Этого имени нет в списке.");


      }
    }
  }











