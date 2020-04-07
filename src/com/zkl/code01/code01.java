package com.zkl.code01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZKL on 2018/11/14  17:39
 * hello
 * 这是直接在github中修改codeo1 
 * 这是在github中第二次修改code01
 * 看下是什么结果
 * 这是在idea中第二次修改code01
 *
 * 这是在github中第三次修改code01
 * 看下fetch的方式 *
 * 在idea中第三次修改code01，测试一下fetch功能
 *
 * 在idea中第四次修改code01，测试一下fetch/merge功能
 */
public class code01 {
    public static void main(String[] args){
        //这是在main函数中测试twosun函数的功能
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = code01.twoSum(nums,target);
        //把结果输出
        System.out.println(result[0]+","+result[1]);
        //结束
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i],i);
        }
        //这是一个循环
        //这个函数的主要代码
        for (int i = 0; i < nums.length-1; i++) {
            int other = target - nums[i];
            if(numMap.containsKey(other)){
                result[0] = i;
                result[1] = numMap.get(other);
                if(result[0] != result[1]){
                    return result;
                }
            }
        }
        //返回一个结果
        return result;
    }
}
