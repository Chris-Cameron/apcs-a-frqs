
/**
 * Determines the most economic time to charge a battery
 *
 * @Christopher Cameron
 * @v1
 */
public class BatteryCharger
{
    /** rateTable has 24 entries representing the charging costs for hours 0 through 23.
     */
    private int[] rateTable;
    
    /** Constructs a rateTable object
     *  @param entries the charging costs for hours 0 through 23
     *         Precondition: rateTable.length = 24
     */
    public BatteryCharger(int[] rateTable)
    {
       this.rateTable = rateTable; 
    }
    
    /** Determines the total cost to charge the battery starting at the beginning of startHour.
     *  @param startHour the hour at which the charge period begins
     *         Precondition: 0<=startHour<=23
     *  @param chargeTime the number of hours the battery needs to be charged
     *         Precondition: chargeTime > 0
     *  @return the total cost to charge the battery
     */
    private int getChargingCost(int startHour, int chargeTime)
    {
        int chargeCost = 0;
        int endTime = startHour + chargeTime;
        
        for (int i = startHour; i < endTime; i++)
        {
            chargeCost += rateTable[i%24];
        }
        
        return chargeCost;
    }
    
    /** Determines start time to charge the battery at the lowest cost for the given charge time. 
     *  @param chargeTime the number of hours the battery needs to be charged
     *         Precondition: chargeTime > 0
     *  @return an optimal start time, with 0 <= returned values <= 23
     */
    public int getChargeStartTime(int chargeTime)
    {
        int optimalTime = 0;
        int minCost = Integer.MAX_VALUE;
        
        for(int i = 0; i < rateTable.length; i++)
        {
            int currentCost = getChargingCost(i,chargeTime);
            
            if(currentCost < minCost)
            {
                minCost = currentCost;
                optimalTime = i;
            }
        }
        
        return optimalTime;
    }
}
