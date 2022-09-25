package lesson6;

public class Pizza {

    String name ;
    Integer size ;

    public Pizza (String n , Integer s) {
        this.name = n ;
        this.size = s ;
    }
    @Override
    public boolean equals  (Object given) {
        if (this == given ) return true ;
        if (!(given instanceof Pizza)) return false ;
     Pizza that = ( Pizza ) given ;
    return this.size.equals( that.size )
    && this.name.equals(that.name) ;
    }

    public void printMe (){
        System.out.printf("Pizza name %s of size %d \n",name, size);
        
    }


}
