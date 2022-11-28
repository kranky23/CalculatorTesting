public class Temperature
{
    public static String convertTemperature(String toUnit, String fromUnit, double temp) {

        if(toUnit.equals(fromUnit))
            return temp + "";
        if(toUnit.toLowerCase().equals("k") && fromUnit.toLowerCase().equals("c") )
        {
            return (temp + 273.15) + "";
        }
        if(toUnit.toLowerCase().equals("c") && fromUnit.toLowerCase().equals("k") )
        {
            return (temp - 273.15) + "";
        }
        if(toUnit.toLowerCase().equals("k") && fromUnit.toLowerCase().equals("f") )
        {
            return ( 273.5 + ((temp - 32.0) * (5.0/9.0))) + "";
        }
        if(toUnit.toLowerCase().equals("f") && fromUnit.toLowerCase().equals("k") )
        {
            return  ((9.0 / 5) * (temp - 273.15) + 32) + "";
        }
        if(toUnit.toLowerCase().equals("c") && fromUnit.toLowerCase().equals("f") )
        {
            return   (((temp - 32) * 5) / 9.0) + "";
        }
        if(toUnit.toLowerCase().equals("f") && fromUnit.toLowerCase().equals("c") )
        {
            return ((temp * 9.0 / 5.0) + 32.0) + "";
        }
        return "Math toUnit is not valid";
    }
}
