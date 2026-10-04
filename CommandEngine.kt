package com.fahd.aistudio.core
class CommandEngine{
 fun process(command:String):String{
  val t=command.trim(); if(t.isEmpty()) return "اكتب أمرًا أولًا."
  return when{
   any(t,"صورة","صور","توليد صورة")->"تم توجيه الأمر إلى وحدة الصور."
   any(t,"فيديو","فيلم","مسلسل","كرتون")->"تم توجيه الأمر إلى وحدة الفيديو."
   any(t,"موسيقى","أغنية","لحن")->"تم توجيه الأمر إلى وحدة الموسيقى."
   any(t,"صوت","دبلج","دبلجة")->"تم توجيه الأمر إلى وحدة الصوت والدبلجة."
   any(t,"ترجم","ترجمة")->"تم توجيه الأمر إلى وحدة الترجمة."
   any(t,"بحث","دور","فتش","ابحث")->"تم توجيه الأمر إلى وحدة البحث."
   any(t,"مشروع","افتح المشروع")->"تم توجيه الأمر إلى إدارة المشاريع."
   else->"استلمت الأمر: $t"
  }
 }
 private fun any(t:String,vararg w:String)=w.any{t.contains(it,ignoreCase=true)}
}
