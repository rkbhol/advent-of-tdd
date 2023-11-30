package org.advent.day1;

/**
 * Elf that is assigned calories
 */
public class Elf implements Comparable<Elf> {

    private int totalCalories = 0;
    private int[] foodCalories;

    public Elf(int elfId) {
        this.elfId = elfId;
    }

    public void setTotalCalories() {
        for (int foodCalorie : foodCalories) {
            this.totalCalories += foodCalorie;
        }
    }

    public int[] getFoodCalories() {
        return foodCalories;
    }

    public void setFoodCalories(int[] foodCalories) {
        this.foodCalories = foodCalories;
        setTotalCalories();
    }

    public int getElfId() {
        return elfId;
    }

    public void setElfId(int elfId) {
        this.elfId = elfId;
    }

    private int elfId;

    /**
     * Calories carried by the Elf
     * @return total calories
     */
    public int getTotalCalories() {
        return totalCalories;
    }

    @Override
    public int compareTo(@org.jetbrains.annotations.NotNull Elf arg0) {
        // TODO Auto-generated method stub
        if(arg0.getTotalCalories()==getTotalCalories())
            return 0;
        else
            return Math.subtractExact(this.getTotalCalories(),arg0.getTotalCalories());
    }

}
