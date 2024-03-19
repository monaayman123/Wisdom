package com.example.myapplication.model

class ApiServices (){
    val list= listOf<Wisdom>(
                 Wisdom("من جد وجد ومن زرع حصد","12/12/12")
              ,  Wisdom("الجنة تحت اقدام الامهات","13/12/12")
              ,  Wisdom("لا سعادة بلا كرامة","14/12/12")
              ,  Wisdom("العقل السليم ف الجسم السليم","15/12/12")
              ,  Wisdom("الصحة تاج على رؤس الاصحاء","12/11/12")
              ,  Wisdom("انها قسمة عادلة فالثراء للاقوياء والاخلاق للضعفاء","20/12/12")
              ,  Wisdom("الوقاية خير من العلاج ","12/12/12")
              ,  Wisdom("الحب اما مرض او تعلق ولكنه يمثل السعادة فى ذروتها ","12/12/12")
    )

    fun getWisdom(): Wisdom {
        val result=(Math.random()*list.size).toInt()
        return list[result]
    }


}