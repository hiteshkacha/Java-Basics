package oops3.encapsulationpackage;

import oops3.personpackage.PersonClass;

public class EncapsulationExample {
    static void main(String[] args) {
        PersonClass p1 = new PersonClass();
        p1.setAge(23);
        System.out.println(p1.viewAge());
    }
}
