package org.example;

import org.example.exception.SmthNotFoundException;
import org.example.repository.FirstRepository;

public class Main {
    private FirstRepository firstRepository;
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String doSmth(int id){

        return firstRepository.findById(id).orElseThrow(SmthNotFoundException::new);
    }

    public void firstMethod(int id){
        try{
            String s = doSmth(id);
        } catch(SmthNotFoundException e){
            System.out.println("Our Exception here");
        } catch(RuntimeException e){
            System.out.println("Other Runtime Exception here");
        } finally{
            System.out.println("Operation complete");
        }
    }
}