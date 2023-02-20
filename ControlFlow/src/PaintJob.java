public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
    }

    public static int getBucketCount(double width , double height , double areaPerBucket , int extraBuckets)
    {
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0)
        {
            return -1;
        }
        else
        {
            return (int) Math.ceil(((height*width) - (areaPerBucket*extraBuckets))/(double)areaPerBucket);
        }
    }

    public static int getBucketCount(double width , double height , double areaPerBucket)
    {
        if(width<=0 || height<=0 || areaPerBucket<=0)
        {
            return -1;
        }
        else {
            return (int) Math.ceil((height*width)/areaPerBucket);
        }
    }

    public static int getBucketCount(double area,double areaPerBucket)
    {
        if(area<=0 ||  areaPerBucket<=0)
        {
            return -1;
        }
        else
        {
            return (int)Math.ceil(area/areaPerBucket);
        }
    }
}
