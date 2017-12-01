
/**
 * Determines whether a trail  is level or difficuult
 *
 * @Christopher Cameron
 * @November 20, 2017
 */
public class Trail
{
    
    /** Representation of the trail. The number of markers on the trail is markers.length. */
    private int[] markers;
    
    /** Constructs a trail given its altitude markers
     * @param markers the array containing the marker varaibles
     */
        public Trail(int[] markers)
    {
        this.markers = markers;
    }
    
    /** Determines if a trail segment is level. A trail segment is defined by a starting marker,
     * an ending marker, and all markers between those two makers.
     * A trail segment is level if it has a difference between the maximum elevation
     * and minimum elevation that is less than or equal to 10 meters.
     * @param start the index of the starting maker
     * @param end the index of the ending marker
     *      Precondition: 0 <= start < end <= markers.length-1
     * @return true if the difference between the maximum and minimum
     * elevation on this segment of the trail is less than or equal to 10 meters;
     * false otherwise
     * */
    public boolean isLevelTrailSegment (int start, int end)
    {
        int max = markers[start];
        int min = markers[start];

        for(int i = start; i <= end; i++)
        {
            if(markers[i] > max)
            {
                max = markers[i];
            }
            else if(markers [i] < min)
            {
                min = markers [i];
            }
        }

        return max-min < 10;
    }

    /** Determines if this trail is rated difficult. A trail is rated by counting the number of changes in
     * elelvation that are at least 30 meters (up or down) between consecutive markes. A trail
     * with 3 or more such changes is rated difficult.
     * @return true if the trail is rated difficult; false otherwise.
     */
    public boolean isDifficult()
    {
        int prev = markers[0];
        int count = 0;

        for(int i=0;i<markers.length;i++)
        {
            if(Math.abs(markers[i]-prev)>=30)
            {
                count++;
            }
            prev = markers[i];
        }

        return count >= 3;
    }   
    
}
