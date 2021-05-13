package project;

class Accounting
{
    public final int SIZE = 3;
    public final int LIMIT = 10000;
    
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;
    public double[] dividendRates = new double[3];
    public double[] dividends = new double[3];
    
    public  void makeDividendRates()
    {
        if(valueOfSupply < LIMIT)
        {
            dividendRates[0] = 1;
            dividendRates[1] = 0;
            dividendRates[2] = 0;
            return;
        }
        
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;
    }
    
    public void makeDividends()
    {
        int i=0;
        while(i < SIZE)
        {
            dividends[i] = getIncome() * dividendRates[i];
            i = i + 1;
        }
    }
    
    public void print()
    {
        makeDividendRates();
        makeDividends();
        
        System.out.println("Value of Supply : "+ valueOfSupply);
        System.out.println("VAT : "+ getVAT());
        System.out.println("Total : "+ getTotal());
        System.out.println("Expense : "+ getExpense());
        System.out.println("Income : "+ getIncome());
        
        int i = 0;
        while(i < SIZE)
        {
            System.out.println("Dividend " + (i+1) + " : " + dividends[i]);
            i = i  +1;
        } 
    }
    
    public double getVAT()
    {
        return valueOfSupply * vatRate;
    }
    
    public double getTotal()
    {
        return valueOfSupply * (vatRate + 1);
    }
    
    public double getExpense()
    {
        return valueOfSupply * expenseRate;
    }
    
    public double getIncome()
    {
        return valueOfSupply - getExpense();
    }
    
}
public class AccountingApp {
    
    public static void main(String[] args)
    {
        Accounting a1 = new Accounting();
        a1.valueOfSupply = Double.parseDouble(args[0]);
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();
        
        Accounting a2 = new Accounting();
        a2.valueOfSupply = Double.parseDouble(args[1]);
        a2.vatRate = 0.25;
        a2.expenseRate = 0.4;
        a2.print();
    }
}
