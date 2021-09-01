package fr.damien.utils;
import fr.damien.Currency;

public class CalculConvertor {
    
    public static String calculCurrency (Currency inputLeft, Currency inputRight, double inputNum) {


        if(!(inputNum== 0)){
          
            double result = (inputNum * inputLeft.getEuroConversionRate() / inputRight.getEuroConversionRate());
            String calculResult = String.format("%.2f", result);
            return calculResult;
        }

        return "";
        
    }

}
