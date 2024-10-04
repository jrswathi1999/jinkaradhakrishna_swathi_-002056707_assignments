/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jrswa
 */
public class PersonDirectory {
     private ArrayList<Person>persons;
     
     public PersonDirectory(){ //contstructor , initialising 
         this.persons = new ArrayList<Person>();
     }

    public ArrayList<Person> getPerson() {
        return persons;
    }

    public void setPerson(ArrayList<Person> account) {
        this.persons = persons;
    }
    
    
    public Person addPerson(){
        Person person= new Person();//method for adding new account
        persons.add(person);
        return person;
    }
    
    public void deletePerson(Person person){//method for deleting account
        persons.remove(person);
    }
    
    //method for search person
    public Person searchPerson(String query){
        for (Person person : persons){
                if(person.getFirstName().equalsIgnoreCase(query)){
                   return person;
                }
                
                if(person.getLastName().equalsIgnoreCase(query)){
                   return person;
                }
                
                if(person.getHomeAddress()!=null && person.getHomeAddress().toString().toLowerCase().contains(query.toLowerCase())){
                    
                    return person;
                }
                
               if(person.getWorkAddress()!=null && person.getWorkAddress().toString().toLowerCase().contains(query.toLowerCase())){
                    
                    return person;
                }
                
              
        }
        return null;// if no match was found
        
    }
  
    
}
