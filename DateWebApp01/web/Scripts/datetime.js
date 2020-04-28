//datepicker

$( function() {
              $( "#datepicker" ).datepicker({
                  dateFormat: "dd-mm-yy",
                  minDate: "01-01-2020",
                  maxDate: "31-12-2020"
              });
            } );
            
//timepicker
$( function() {
                $("#timepicker").timepicker({
                timeFormat: 'h:mm p',
                interval: 30,
                minTime: '10:00am',
                maxTime: '6:00pm',
                defaultTime: '11',
                startTime: '10:00'
                });
            });


