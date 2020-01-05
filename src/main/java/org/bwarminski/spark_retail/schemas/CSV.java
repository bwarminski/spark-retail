package org.bwarminski.spark_retail.schemas;

import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

public class CSV {
    public static final StructType StoreSales = DataTypes.createStructType(new StructField[] {
            DataTypes.createStructField("ss_sold_date_sk", DataTypes.IntegerType, true),
            DataTypes.createStructField("ss_sold_time_sk", DataTypes.IntegerType, true),
            DataTypes.createStructField("ss_item_sk", DataTypes.IntegerType, false),
            DataTypes.createStructField("ss_customer_sk", DataTypes.IntegerType, true),
            DataTypes.createStructField("ss_cdemo_sk", DataTypes.IntegerType, true),
            DataTypes.createStructField("ss_hdemo_sk", DataTypes.IntegerType, true),
            DataTypes.createStructField("ss_addr_sk", DataTypes.IntegerType, true),
            DataTypes.createStructField("ss_store_sk", DataTypes.IntegerType, true),
            DataTypes.createStructField("ss_promo_sk", DataTypes.IntegerType, true),
            DataTypes.createStructField("ss_ticket_number", DataTypes.IntegerType, false),
            DataTypes.createStructField("ss_quantity", DataTypes.IntegerType, true),
            DataTypes.createStructField("ss_wholesale_cost", DataTypes.createDecimalType(7,2), true),
            DataTypes.createStructField("ss_list_price", DataTypes.createDecimalType(7,2), true),
            DataTypes.createStructField("ss_sales_price", DataTypes.createDecimalType(7,2), true),
            DataTypes.createStructField("ss_ext_discount_amt", DataTypes.createDecimalType(7,2), true),
            DataTypes.createStructField("ss_ext_sales_price", DataTypes.createDecimalType(7,2), true),
            DataTypes.createStructField("ss_ext_wholesale_cost", DataTypes.createDecimalType(7,2), true),
            DataTypes.createStructField("ss_ext_list_price", DataTypes.createDecimalType(7,2), true),
            DataTypes.createStructField("ss_ext_tax", DataTypes.createDecimalType(7,2), true),
            DataTypes.createStructField("ss_coupon_amt", DataTypes.createDecimalType(7,2), true),
            DataTypes.createStructField("ss_net_paid", DataTypes.createDecimalType(7,2), true),
            DataTypes.createStructField("ss_net_paid_inc_tax", DataTypes.createDecimalType(7,2), true),
            DataTypes.createStructField("ss_net_profit", DataTypes.createDecimalType(7,2), true)
    });
}
