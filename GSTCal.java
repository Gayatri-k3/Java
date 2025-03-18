public class GSTCal {
    public static double gstCal(double gst) {
        Shopping.totalPayableAmount = Shopping.total * gst;
        Shopping.finalBill = Shopping.totalPayableAmount + Shopping.total;
        return Shopping.finalBill;
    }
}
