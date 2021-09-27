class Flower{
                String name;
                String color;
                int noOfPetals;
               void bloom( ){
               System.out.println(color+="  "+name+" is blooming...!");
               }
              void shedFragnance( ){
              System.out.println(color+="  "+name+" is shedding fragnance...!");
              }
public static void main(String [ ] args){
             Flower rose=new Flower( );
             rose.name="Rose";
            rose.color="Yellow";
           rose.noOfPetals=14;
     Flower Jasmine=new Flower ( );
     jasmine.name="Jasmine";
    jasmine.color="White";
   jasmine.noOfPetals=6;
        jasmine.bloom( );
       rose.bloom( );
      jasmine.shedFragnance( );
     rose.shedFragnance( );

     Flower lotus=new Flower( );
     lotus.name="Lotus";
    lotus.color="Pink";
   lotus.noOfPetals=20;

  lotus.bloom( );
 lotus.shedFragnance( );
 new Flower( ).bloom( );
}
}


