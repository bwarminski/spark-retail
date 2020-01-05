package org.bwarminski.spark_retail.setup;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import org.bwarminski.spark_retail.schemas.CSV;

import java.io.Serializable;

public class Setup implements Serializable {

    public void start() {
        SparkSession spark = SparkSession
                .builder()
                .appName("Setup Store Data")
                .master("local[*]")
                .getOrCreate();

        Dataset<Row> df = spark.read().format("csv")
                .option("multiline", true)
                .option("sep", "|")
                .schema(CSV.StoreSales)
                .load("/Users/bwarminski/tpc-ds-output/store_sales.dat");

        df.show(5, false);// , 25);
        df.printSchema();
    }

    public static void main(String []args) {
        Setup app = new Setup();
        app.start();
    }
}
