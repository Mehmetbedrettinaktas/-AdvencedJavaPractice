package ocaQuestions;

public class C10_Constructor {
    int count;
    public void C10_Constructor(){ // bu Method dur
        count=4;

    }
    public  static  void main(String[] args) {
        C10_Constructor cns= new C10_Constructor();
        System.out.println(cns.count); // A.--> 0 dir


    }
    public C10_Constructor (){ // bu constructor dir.
        count=4;
    }
}
