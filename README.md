# SE_lab3_Diba_AliAsghar

## گزارش

<div dir="rtl">
در این آزمایش، ۲ فولدر گزارش به نام‌های htmlReport و htmlReport2 وجود دارد.

در فولدر htmlReport، فایل‌های خروجی html
مربوط به گزارش بار اول اجرای تست (بدون اضافه کردن تست‌های اضافه برای بهبود پوشش آزمون)
قرار دارند.

در فولدر دوم (htmlReport2)، گزارش آزمون و پوشش آن بعد از اضافه کردن توابع بهبود قرار دارند.

هردوی این گزارش‌ها با باز کردن فایل index.html در یک مرورگر قابل مشاهده هستند.

با توجه به این گزارش‌ها، می‌توان مشاهده کرد که کلاس JSONObject تحت پوشش آزمون قرار ندارد، پس تابع testJSONObject 
برای بهبود پوشش آزمون این کلاس نوشته شد.
با اضافه کردن تابع testParserWithException، کلاس ParserException تحت پوشش قرار گرفت و همچنین پوشش توابع در فایل 
JSONValue و JSONParser نیز بهبود یافت.
در نهایت با تابع testJSONArrayBoolean پوشش توابع را در فایل JSONArray بهبود دادیم.

پیش از بهبود:
<img width="1280" alt="image" src="https://user-images.githubusercontent.com/45513491/232138804-b56632e7-8257-444b-8a52-15df1d628f1b.png">

  
پس از بهبود:
<img width="1279" alt="image" src="https://user-images.githubusercontent.com/45513491/232138676-d2530166-1714-42b9-9f6b-5d2388d7cfe1.png">
