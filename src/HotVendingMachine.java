

import java.util.List;

public class HotVendingMachine implements VendingMachine {
    public HotVendingMachine(List<HotDrink> drinks) {
        this.drinks = drinks;
    }

    public void setDrinks(List<HotDrink> drinks) {
        this.drinks = drinks;
    }

    
    @Override
    public void getDrink(Integer id, Integer volume, Integer temperature) {
        Iterable<HotDrink> drinks;

        for (HotDrink drink : drinks) {
            if (drink.getId().equals(id)) {

                if (drink.getVolume().equals(volume)) {

                    if (drink.getTemperature().equals(temperature)) {
                        System.out.println("Возьмите ваш напиток " + drink);
                    }

                }

            }
        }

    }

}
    
