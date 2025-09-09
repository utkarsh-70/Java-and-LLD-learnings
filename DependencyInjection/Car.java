package DependencyInjection;

class Engine{
}
public class Car {
    private Engine engine=new Engine();
}
//Dependency is when one class needs other to work.

//The problem with this code is that its tightly coupled 
//cant replace the engine object with DieselEngine once created.

//So to solve this problem we use dependency injection.
//(Instead of creating dependencies we pass it from outside(inject it))

