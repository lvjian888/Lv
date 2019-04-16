$(function() {
	//邮政编码   isZipCode:true 
	jQuery.validator.addMethod("isZipCode", function(value, element) {
		var tel = /^[0-9]{6}$/;
		return this.optional(element) || (tel.test(value));
	}, "请正确填写您的邮政编码");
	//身份证号  isIDCard:true
	jQuery.validator.addMethod("isIDCard", function(value, element) {
		var tel = /^[1-9]\d{16}[0-9Xx]$/;
		return this.optional(element) || (tel.test(value));
	}, "请正确填写您的身份证号");
	//手机号 isTelphone:true
	jQuery.validator.addMethod("isTelphone", function(value, element) {
		var tel =/^[1][3458]\d{9}$/;
		return this.optional(element) || (tel.test(value));
	}, "请正确填写您的手机号");
	//中文: isCN:true
	jQuery.validator.addMethod("isCN", function(value, element) {
		if(value==null||value==""){
			return false;
		}else{
			var tel = /^[\u4e00-\u9fa5]$/;
			for(var i in value){				
				if(!tel.test(value[i])){
					return false;
				}
			}
		}
		return true;
	}, "请正确填写中文");
	//IP地址:true
	jQuery.validator.addMethod("isIP", function(value, element) {
		var tel =/^(\d+)\.(\d+)\.(\d+)\.(\d+)$/g;
		return this.optional(element) || (tel.test(value));
	}, "请正确填写您的IP地址");
});