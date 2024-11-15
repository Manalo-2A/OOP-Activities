class Dog {
  String name;
  boolean isMale;
  int numOfPuppies;
  Dog[] listOfPuppies;
public int addPuppies( Dog name){
   listOfPuppies[numOfPuppies] = name;
   return numOfPuppies++;

}

public void setName(String names){
  name = names;
}

public String showName(){
  System.out.println("My name is "+name);
  return name;
}

public void setNumberPuppies(int x){
  listOfPuppies = new Dog[x];
}

public void bark(){
  System.out.println(name+" Woof Woof!");
}

public int showNumberPuppies(){
  System.out.println("Number of Puppies: "+numOfPuppies);
  return numOfPuppies;
}

public void AllPuppies(){
  for(int i = 0; i < numOfPuppies; i++){
    System.out.println("\n "+"Index " +i);
    System.out.println("Name: "+listOfPuppies[i].name);
    System.out.println("Is Male: "+listOfPuppies[i].isMale);
  }

}


}
