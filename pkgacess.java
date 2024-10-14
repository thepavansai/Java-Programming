import dir1.Package_ex1;//using package.classname
import dir2.pkg_ex2;

//import dir2.*;//package.*


public class pkgacess {
    public static void main(String[] phantom){
        Package_ex1 p1= new Package_ex1();
        p1.msg();
        pkg_ex2 p2= new pkg_ex2();
        p2.pkg2();
        dir3.pkg3 s= new dir3.pkg3();// import fully qualified name
        s.disp();
    }
}
// pkg ->import -> class
/*
    subpackage -> package inside package
 */