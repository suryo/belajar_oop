<?php
class Person {
    public function __toString() {
        return "This is a person object\n";
    }
}
class PersonExample {
    public static function main() {
        // create object here
        $person1 = new Person();
        $person2 = new Person();

        $person3 = new Person();

        echo $person1 . "\n";
        echo $person2 . "\n";
        echo $person3 . "\n";
    }
}

PersonExample::main();
?>
