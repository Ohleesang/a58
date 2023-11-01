package com.example.a58

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun isPrime( n :Int):Boolean{
                var answer = true
                for(i in 2 until n){
                    if(n%i==0) {
                        answer = false
                        break
                    }
                }
                return answer
            }
            fun solution(nums: IntArray): Int {
                var answer = -1
                var result = mutableListOf<Int>()

                // 주여진 서로 다른 3개를 골라 합쳐 소수를 만든다 -->nC3(조합)
                // 1. nC3의 합을 구하기 --> r이 4이상의 경우는 재귀함수를 써야한다고함
                // 2. 그 합을 배열로 저장한 후 소수인 값을 측정하자.
                for(i in 0 until nums.size){
                    for(j in i+1 until nums.size){
                        for(k in j+1 until nums.size){
                            if(isPrime(nums[i]+nums[j]+nums[k]))
                            result.add(nums[i]+nums[j]+nums[k])
                        }
                    }
                }
                answer = result.size
                return answer
            }
        }
        val a = Solution()
        a.solution(intArrayOf(1,2,3,4))
        a.solution(intArrayOf(1,2,7,6,4))
    }
}