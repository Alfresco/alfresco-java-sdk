
# RequestStats

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **String** | The stats field |  [optional]
**label** | **String** | A label to include for reference the stats field |  [optional]
**min** | **Boolean** | The minimum value of the field |  [optional]
**max** | **Boolean** | The maximum value of the field |  [optional]
**sum** | **Boolean** | The sum of all values of the field |  [optional]
**countValues** | **Boolean** | The number which have a value for this field |  [optional]
**missing** | **Boolean** | The number which do not have a value for this field |  [optional]
**mean** | **Boolean** | The average |  [optional]
**stddev** | **Boolean** | Standard deviation |  [optional]
**sumOfSquares** | **Boolean** | Sum of all values squared |  [optional]
**distinctValues** | **Boolean** | The set of all distinct values for the field (This can be very expensive to calculate) |  [optional]
**countDistinct** | **Boolean** | The number of distinct values  (This can be very expensive to calculate) |  [optional]
**cardinality** | **Boolean** | A statistical approximation of the number of distinct values |  [optional]
**cardinalityAccuracy** | **Float** | Number between 0.0 and 1.0 indicating how aggressively the algorithm should try to be accurate. Used with boolean cardinality flag. |  [optional]
**excludeFilters** | **List&lt;String&gt;** | A list of filters to exclude |  [optional]
**percentiles** | **List&lt;Float&gt;** | A list of percentile values, e.g. \&quot;1,99,99.9\&quot; |  [optional]



