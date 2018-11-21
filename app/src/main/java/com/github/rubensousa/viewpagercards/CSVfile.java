/*package com.github.rubensousa.viewpagercards;


 * Created by psanchez on 3/17/2018.
 * with help from https://javapapers.com/android/android-read-csv-file/


import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVfile {
    InputStream inputStream;

    public CSVfile(InputStream inputStream){
        this.inputStream = inputStream;
    }

    public List read(){
        List<Question> resultList = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        try {
            reader.readLine(); // consume headings of csv file
            String csvLine;
            int counter = 0;
            while ((csvLine = reader.readLine()) != null) {
                String[] row = csvLine.split(",", 8);
                resultList.add(new Question(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7]));
                counter++;
            }
            Log.v("counter", counter + "");
        }
        catch (IOException ex) {
            throw new RuntimeException("Error in reading CSV file: "+ex);
        }
        finally {
            try {
                inputStream.close();
            }
            catch (IOException e) {
                throw new RuntimeException("Error while closing input stream: "+e);
            }
        }
        return resultList;
    }
}
*/
