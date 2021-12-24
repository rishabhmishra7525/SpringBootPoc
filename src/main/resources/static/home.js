
		$(document).ready(function() {
			$("#comm").hide();
			$("#bas").hide();
			$("#opps").hide();
			$("#pogr").hide();
			$("#version").hide();
			$("#database").hide();
			$("#basicconcept").hide();

			var comm = false;
			var bas = false;
			var opps = false;
			var pogr = false;
			var version = false;
			var database = false;
			var basicconcept = false;

			$("#communication").change(function() {

				validate_Communication();
			});

			$("#basicweb").change(function() {

				validate_Basic();
			});

			$("#opp").change(function() {

				validate_Opps();
			});

			$("#program").change(function() {

				validate_Programs();
			});

			$("#versioncontroll").change(function() {

				validate_VersionControl();
			});

			$("#databse").change(function() {

				validate_databse();
			});
			$("#basicconcepts").change(function() {

				validate_BasicConcept();
			});

			function validate_BasicConcept() {
				var val = $("#basicconcepts").val();
				val = val.slice(-1);
				if (val != '') {

					$("#basicconcept").html(val + "/5");
					$("#basicconcept").show();
					basicconcept = false;
				} else {
					$("#basicconcept").hide();
					basicconcept = true;
				}
				return basicconcept;
			}
			function validate_databse() {
				var val = $("#databse").val();
				val = val.slice(-1);
				if (val != '') {

					$("#database").html(val + "/5");
					$("#database").show();
					database = false;
				} else {
					$("#database").hide();
					database = true;
				}
				return database;
			}

			function validate_Programs() {
				var val = $("#program").val();
				val = val.slice(-1);
				if (val != '') {

					$("#pogr").html(val + "/5");
					$("#pogr").show();
					pogr = false;
				} else {
					$("#pogr").hide();
					pogr = true;
				}
				return pogr;
			}

			
			function validate_VersionControl() {
				var val = $("#versioncontroll").val();
				val = val.slice(-1);
				if (val != '') {

					$("#version").html(val + "/5");
					$("#version").show();
					version = false;
				} else {
					$("#version").hide();
					version = true;
				}
				return version;
			}

			
			
			function validate_Opps() {
				var val = $("#opp").val();
				val = val.slice(-1);
				if (val != '') {

					$("#opps").html(val + "/5");
					$("#opps").show();
					opps = false;
				} else {
					$("#opps").hide();
					opps = true;
				}
				return opps;
			}

			function validate_Basic() {
				var val = $("#basicweb").val();
				val = val.slice(-1);
				if (val != '') {

					$("#bas").html(val + "/5");
					$("#bas").show();
					bas = false;
				} else {
					$("#bas").hide();
					bas = true;
				}
				return bas;
			}

			function validate_Communication() {
				var val = $("#communication").val();
				val = val.slice(-1);
				if (val != '') {

					$("#comm").html(val + "/5");
					$("#comm").show();
					comm = false;
				} else {
					$("#comm").hide();
					comm = true;
				}
				return comm;
			}
	
		});

		var selectedValue = "";
		function getSelectValue() {
			selectedValue = document.getElementById("experience").value;

			if (selectedValue == '') {

				$(" div.container").hide();
			} else {
				$(" div.container").show();
			}
		}

		
		
		
		$(document).ready(
		function() {

			// SUBMIT FORM
			$("#myform").submit(function(event) {
				
				event.preventDefault();
				ajaxPost();
			});

			function ajaxPost() {

				// PREPARE FORM DATA
				var formData = {
					communication : $("#communication").val(),
					basicweb : $("#basicweb").val(),
					opp : $("#opp").val(),
					program : $("#program").val(),
					versioncontroll : $("#versioncontroll").val(),
					databse : $("#databse").val(),
					basicconcepts : $("#basicconcepts").val()
				}

				// DO POST
				$.ajax({
					type : "POST",
					contentType : "application/json",
					url : "process",
					data : JSON.stringify(formData),
					dataType : 'json',
					success : function(result) {
						
							$("#postResultDiv").html(result);
						
					},
					error : function(e) {
						alert("Error!")
						console.log("ERROR: ", e);
					}
				});

			}

		})
		
		
	  
		
	
