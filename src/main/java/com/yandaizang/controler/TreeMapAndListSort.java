package com.yandaizang.controler;

import java.util.*;

public class TreeMapAndListSort {

        public static void orederSort(TreeMap<Double,Integer> ctMap,TreeMap<Double,Integer> rtMap){
            Long t1 = System.currentTimeMillis();
            List<Double> list = new ArrayList<Double>();
            Integer cnum = 1;
            Integer rnum = 1;
            //循化插入list集合
            for(Map.Entry<Double, Integer> entry:ctMap.entrySet()){
                //System.out.println("成交价:"+entry.getKey()+ " --- 数量:"+entry.getValue());
                while (cnum<=entry.getValue()){
                    cnum++;
                    list.add(entry.getKey());
                }
                cnum = 1;
            }
            for(Map.Entry<Double, Integer> entry:rtMap.entrySet()){
                //System.out.println("成交价:"+entry.getKey()+ " --- 数量:"+entry.getValue());
                while (rnum<=entry.getValue()){
                    rnum++;
                    list.add(entry.getKey());
                }
                rnum = 1;
            }
            //sort排序
            Collections.sort(list);
            //System.out.println(Arrays.asList(list));
            //判断集合数奇偶,根据集合数量找出中间那个值，就是中间价
            Double z1 = 0D;
            Double z2 = 0D;
            if((list.size()/2)%2==0){
                z1 = Arrays.asList(list.get(list.size()/2)).get(0);
                z2 = Arrays.asList(list.get(list.size()/2-1)).get(0);
                System.out.println("中间价1："+z1);
                System.out.println("中间价2："+z2);
            }else{
                z1 = Arrays.asList(list.get(list.size()/2)).get(0);
                System.out.println("中间价1："+z1);
            }

            for(Map.Entry<Double, Integer> entry:ctMap.entrySet()){
                if(entry.getKey()<z1){
                    System.out.println("卖成交价:"+entry.getKey()+ " --- 数量:"+entry.getValue());
                }else if(entry.getKey()==z1){
                    System.out.println("以中间价为条件查询数据库，按时间排序");
                    System.out.println("根据时间成交,卖成交价:"+entry.getKey()+ " --- 数量:"+entry.getValue());
                }
            }
            for(Map.Entry<Double, Integer> entry:rtMap.entrySet()){
                if(entry.getKey()>z1){
                    System.out.println("买成交价:"+entry.getKey()+ " --- 数量:"+entry.getValue());
                }else if(entry.getKey()==z1){
                    System.out.println("以中间价为条件查询数据库，按时间排序");
                    System.out.println("根据时间成交,买成交价:"+entry.getKey()+ " --- 数量:"+entry.getValue());
                }
            }

            if(z2!=z1 && z2!=0D){
                System.out.println("按中间价2计算");
                for(Map.Entry<Double, Integer> entry:ctMap.entrySet()){
                    if(entry.getKey()<z2){
                        System.out.println("卖成交价:"+entry.getKey()+ " --- 数量:"+entry.getValue());
                    }else if(entry.getKey()==z2){
                        System.out.println("以中间价为条件查询数据库，按时间排序");
                        System.out.println("根据时间成交,卖成交价:"+entry.getKey()+ " --- 数量:"+entry.getValue());
                    }
                }
                for(Map.Entry<Double, Integer> entry:rtMap.entrySet()){
                    if(entry.getKey()>z2){
                        System.out.println("买成交价:"+entry.getKey()+ " --- 数量:"+entry.getValue());
                    }else if(entry.getKey()==z2){
                        System.out.println("以中间价为条件查询数据库，按时间排序");
                        System.out.println("根据时间成交,买成交价:"+entry.getKey()+ " --- 数量:"+entry.getValue());
                    }
                }
            }
            //时间戳
            System.out.println("总数据"+list.size()+"条\n所耗时间："+(System.currentTimeMillis()-t1)+"毫秒");
        }
        public static void main(String[] args) {
            //TreeMap自动根据key排序,从数据库查询成交价和数量存于TreeMap中,value是数量,key是成交价
            TreeMap<Double,Integer> ctMap = new TreeMap<Double,Integer>();
            //卖出
            ctMap.put(16.09,73);
            ctMap.put(16.06,1);
            ctMap.put(16.04,75);
            ctMap.put(16.03,5);
            ctMap.put(16.02,10);
            ctMap.put(16.00,562);
            ctMap.put(15.99,139);
            ctMap.put(15.98,55);
            ctMap.put(15.97,32);
            ctMap.put(15.96,154);
            TreeMap<Double,Integer> rtMap = new TreeMap<Double,Integer>();
            //买入
            rtMap.put(15.95,12);
            rtMap.put(15.94,14);
            rtMap.put(15.93,541);
            rtMap.put(15.92,453);
            rtMap.put(15.91,149);
            rtMap.put(15.90,292);
            //传入2个treeMap
            orederSort(ctMap,rtMap);
        }
}
