/**
 * 
 */
//alert("Localhost:8080 says: This is the date template");

alertify.confirm("Localhost:8080 says: This is the date template",
  function() {
    alertify.success('Ok');
  },
  function() {
    alertify.error('Cancel');
  }
);