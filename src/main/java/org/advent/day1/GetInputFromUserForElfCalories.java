package org.advent.day1;
import java.util.ArrayList;
import java.util.Scanner;

class GetInputFromUserForElfCalories {
    public static void main(String[] args) {
        ArrayList<Elf> elfs= new ArrayList<>();
        int elfid=1;
        while(elfid<=5) {
            Elf elf=new Elf(elfid);
            System.out.printf("Enter Calories collected by Elf %d " +
                    "(Enter a number in each line. To end enter a space):\n",elfid);
            Scanner in = new Scanner(System.in); // Using Scanner for Getting Input from User
            int i = 0;
            int[] foodCalories = new int[10];
            while (true) {
                String input = in.nextLine();
                if (input.equals(" ")) break;
                foodCalories[i] = Integer.parseInt(input);
                i++;
            }
            elf.setFoodCalories(foodCalories);
            elfs.add(elf);
            elfid++;
        }

        //find the elf with maximum calories
        int elfWithMaxCalories=elfs.get(0).getElfId();
        for (Elf elf: elfs) {
            if (elf.compareTo(elfs.get(elfWithMaxCalories)) >0) elfWithMaxCalories=elf.getElfId();
        }
        System.out.printf("Elf with maximum calories is %d",elfWithMaxCalories);
    }

}

