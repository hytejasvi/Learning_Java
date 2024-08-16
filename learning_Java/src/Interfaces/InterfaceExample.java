package Interfaces;

public class InterfaceExample {
    public static void main(String[] args) {
        ICamera cam = new SmartPhone(); /*see here, the reference is of interface but as we cannot create an object
        of interface, the object is created of the class SmartPhone.
        In this case, the reference cam can only access methods available in the ICamera interface of SmartPhone object*/
        IMusicPlayer mp = new SmartPhone(); /*see here, the reference is of interface but as we cannot create an object
        of interface, the object is created of the class SmartPhone.
        In this case, the reference cam can only access methods available in the IMusicPlayer interface of SmartPhone object */

        Phone p = new SmartPhone(); /*see here, the reference is of class phone and the object is created of the class SmartPhone.
        In this case, the reference cam can only access methods available in the Phone class */

        SmartPhone sp = new SmartPhone();
        Phone p1 = new Phone();

        cam.click();
        cam.record();
        /*above methods called can only access/call methods that are available in the ICamera interface.
        the methods are overridden in the SmartPhone class.*/

        mp.play();
        mp.stop();
        /*above method calling can only access/call methods that are available in the IMusicPlayer interface.
        the methods are overridden in the SmartPhone class.*/

        p.call(); //--> this will print : SmartPhone calling -> as this method is overwritten in SmartPhone class
        p.sms(); //--> this will print : messaging services -> as this method is not overwritten in SmartPhone class
        /*above method calling can only access/call methods that are available in the Phone class.
        the methods are overridden in the SmartPhone class.*/

        sp.call();
        sp.sms();

        /*we can see that when the reference is of SmartPhone and a SmartPhone object is created, it can call any
        methods of phone class and any method of the overridden interfaces,
        but if the reference is created for any particular extended class or an implemented interface, then that
        reference can access only methods of that particular reference entity.*/

    }
}
