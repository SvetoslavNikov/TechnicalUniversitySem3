package javaLU.LU4.abstractExercises;

public class summarize {
    /*
    Abstract Class and Interface

    Interface:: A contract. Defines methods without implementations.
    Classes can implement multiple interfaces.

    Abstract Class: A blueprint.
    Can have both abstract (no implementation) and concrete
    (with implementation) methods.
    Used for shared code among related classes.
    Classes can only extend one abstract class.
     */

    // abstract =  	abstract classes cannot be instantiated, but they can have a subclass
    //              The point is to forcefully make it impossible to create improper instance

    //				abstract methods are declared without an implementation, they force the subclass to write
    //				an implementation = Override
    //              of the abstract method

            /* ако имаме клас, който да обобщи поведение и неспецифични, а общи белези на някои други класове,
            то го декларираме като абстрактен клас, а наследниците му –
            като конкретни класове, които задължително да имплементират поведението, но всеки по свой начин.

            Интерфейс не може да се инстанцира!
       В интерфейс може да има абстрактни и default методи.
    Интерфейс може да бъде имплементиран само от клас.
    За да може клас да имплементира интерфейс, то интерфейсът трябва да е публичен, методите му също.
    Интерфейсът не може да бъде деклариран с private, protected или transient.
    По подразбиране всички методи на интерфейса са: public abstract.
    Променливите на интерфейса са public static final Например:*/

}
