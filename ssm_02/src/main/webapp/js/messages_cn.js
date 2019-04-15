//默认校验规则
jQuery.extend(jQuery.validator.messages, {
	required : "必选字段",//required:true
	remote : "请修正该字段",//remote :{url:"",type:"",dataType:"",data:{}}使用 ajax 方法调用 {} 验证输入值。默认会提交当前验证的值到远程地址，如果需要提交其他的值，可以使用 data 选项。
	email : "请输入正确格式的电子邮件",
	url : "请输入合法的网址",
	date : "请输入合法的日期",
	dateISO : "请输入合法的日期 (ISO).",
	number : "请输入合法的数字",
	digits : "只能输入整数",
	creditcard : "请输入合法的信用卡号",
	equalTo : "请再次输入相同的值",//"#field" 
	accept : "请输入拥有合法后缀名的字符串",
	maxlength : $.format("请输入一个 长度最多是 {0} 的字符串"),//maxlength:5 长度最多是 5 的字符串（汉字算一个字符）
	minlength : $.format("请输入一个 长度最少是 {0} 的字符串"),
	rangelength : $.format("请输入 一个长度介于 {0} 和 {1} 之间的字符串"),//rangelength:[6,12] 长度介于 6 和 10 之间的字符串（汉字算一个字符）。
	range : $.format("请输入一个介于 {0} 和 {1} 之间的值"),//range:[5,10] 输入值必须介于 5 和 10 之间。
	max : $.format("请输入一个最大为{0} 的值"),//max:5
	min : $.format("请输入一个最小为{0} 的值")
});