
// "An interface is like a promise, a contract to follow."
// "Interfaces are like promises – they say WHAT to do, not HOW to do it."
interface Annimal {
    void sound();  // "Every animal must have a sound, but I won’t say HOW!"
}

// "You can have multiple promises (multiple interfaces)."
interface Herbivores {
    // "Right now it’s empty, but it still counts as a promise!"
}

// "Horse is keeping TWO promises – Annimal + Herbivores."
class Horse implements Annimal, Herbivores {

    // "Since I promised Annimal, I MUST define sound() here."
    public void sound() {
        System.out.println("Horse neighs");  // "Actual behavior comes here."
    }
}

public class Interfaces_oops {
    public static void main(String[] args) {

        // "Interface type = Reference, Class type = Object."
        Annimal h = new Horse();

        // "Call the method that was promised in Annimal."
        h.sound();
    }
}





 /*
  * 🌟 Quotes to Remember Interfaces

"An interface is a contract, not construction."
→ It only declares rules, no implementation.

"A class must pay its dues when it signs the interface contract."
→ Any class that implements must override the methods.

"Multiple inheritance through interfaces is like having multiple advisors, not multiple parents."
→ A class can implement many interfaces.

"Interfaces are ‘what to do’, classes decide ‘how to do’."

"Interfaces = 100% abstraction (before Java 8)."
→ Only method declarations, no body (until default/static methods were added in Java 8).

✨ Quick Trick to Recall
Think of an interface like a job description:

Job Description (interface): "You must know how to speak."

Candidate (class): Horse → "Yes, I can neigh!"
  */