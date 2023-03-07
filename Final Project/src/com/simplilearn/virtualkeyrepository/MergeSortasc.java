package com.simplilearn.virtualkeyrepository;

import java.io.File;

public class MergeSortasc {	

    
    void merge(String arr[], int l, int m, int r)
    {
        
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        String L[] = new String [n1];
        String R[] = new String [n2];



    
    /*Copy data to temp arrays*/
    for (int i=0; i<n1; ++i)
        L[i] = arr[l + i];
    for (int j=0; j<n2; ++j)
        R[j] = arr[m + 1+ j];



    int i = 0, j = 0;

            int k = l;
    while (i < n1 && j < n2)
    {
    	int comparison= L[i].compareToIgnoreCase(R[j]);     
    	
        if (comparison==0 || comparison<1)
        {
            arr[k] = L[i];
            i++;
        }
        else
        {
            arr[k] = R[j];
            j++;
        }
        k++;
    }
    while (i < n1)
    {
        arr[k] = L[i];
        i++;
        k++;
    }

    
    while (j < n2)
    {
        arr[k] = R[j];
        j++;
        k++;

    }
}

void sort(String arr[], int l, int r)
{
    if (l < r)
    {
        
        int m = (l+r)/2;

        
        sort(arr, l, m);
        sort(arr , m+1, r);

        
        merge(arr, l, m, r);
    }
}

    public void printArray(String arr[])
{
    int n = arr.length;
    for (int i=0; i<n; ++i)
        System.out.println(arr[i] );
    System.out.println();
}

    


}         //End of class