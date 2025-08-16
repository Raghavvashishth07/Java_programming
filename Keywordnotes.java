// Quick Revision of Important Java Keywords
// super, final, try-catch-finally, throw, throws, synchronized, volatile, instanceof

class Vehicle {
    String brand = "Generic Brand";
}

class Car extends Vehicle {
    String brand = "Tesla";

    void display() {
        // 'super' keyword → used to access parent class members
        System.out.println("Child brand: " + brand);
        System.out.println("Parent brand using super: " + super.brand);
    }
}

final class Constants {
    // 'final' keyword → cannot be changed, inherited, or overridden
    final int MAX_SPEED = 120;
}

class Bank {
    void withdraw(int amount) throws Exception {
        if (amount > 5000) {
            // 'throw' keyword → throw custom exception
            throw new Exception("Limit exceeded!");
        } else {
            System.out.println("Withdrawn: " + amount);
        }
    }
}

class SharedCounter {
    private int count = 0;

    // 'synchronized' keyword → only one thread can execute this at a time
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class FlagCheck {
    // 'volatile' → ensures value is read directly from memory, not thread cache
    volatile boolean running = true;
}

public class Keywordnotes {
    public static void main(String[] args) {
        // super example
        Car c1 = new Car();
        c1.display();

        // final example
        Constants cst = new Constants();
        System.out.println("Final constant MAX_SPEED: " + cst.MAX_SPEED);

        // try-catch-finally + throw + throws
        Bank b = new Bank();
        try {
            b.withdraw(6000); // risky
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Transaction attempt complete (finally block).");
        }

        // instanceof example
        if (c1 instanceof Vehicle) {
            System.out.println("c1 is a Vehicle");
        }

        // synchronized + volatile → conceptual (not running threads here)
        SharedCounter counter = new SharedCounter();
        counter.increment();
        System.out.println("Counter after sync increment: " + counter.getCount());

        FlagCheck flag = new FlagCheck();
        System.out.println("Volatile flag default: " + flag.running);
    }
}

/*
NOTES:
1. super → Access parent class methods/variables.
2. final → Variable constant, method cannot be overridden, class cannot be inherited.
3. try-catch-finally → Exception handling blocks.
4. throw → Throw custom exception object.
5. throws → Declares exceptions a method might throw.
6. synchronized → Thread safety, only one thread executes method at a time.
7. volatile → Ensures variable updates are always visible across threads.
8. instanceof → Checks if an object belongs to a class.
*/
