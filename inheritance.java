/*there are 5 types of inheritances in java those are 
  1.single inheritance 
  2.multilevel inheritance
  3.heirarchical inheritance 
  4.multilevel inheritance
  5.hybrid inheritance */
//single
class Parent {
some(){
  System.out.println("Parent love child");
}}
class Child extends Parent         
  {
    thing(){
    System.out.println("Child some time hates Parent");
  }}
  class Main{
    public static void main(String []args){
      //create object for child 
      Child c=new Child();
      
    }}
