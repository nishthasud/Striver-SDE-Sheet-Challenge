class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      
      int m=matrix.length;
      int n=matrix[0].length;
     int arr[]=new int[m*n];
      int k=0;
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          arr[k]=matrix[i][j];
          k++;
          
        }
      }
      Arrays.sort(arr);
      int ans=bs(arr,target);
      if(ans==-1)
        return false;
      else 
        return true;
      
        
    }
  
  int bs(int arr[],int target)
  {
    int l=0,h=arr.length-1;
    while(l<=h)
    {
      int mid=(l+h)/2;
      if(arr[mid]==target)
        return mid;
      if(arr[mid]>target)
        h=mid-1;
      else
        l=mid+1;
      
    }
    return -1;
    
  }
}