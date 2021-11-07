import axios from 'axios'
import { useState, useEffect } from 'react'
import Chart from 'react-apexcharts'
import { round } from 'utils/format'
import { SaleSuccess } from 'types/sale'
import { BASE_URL } from 'utils/requests'

type SeriesData = {
  name: string,
  data: number[]
}

type ChartData = {
  labels: {
    categories: string[]
  },
  series: SeriesData[]
}

const BarChart = () => {
  const [chartData, setChartData] = useState<ChartData>({
    labels: {
      categories: []
    },
    series: [
      {
        name: "",
        data: []
      }
    ]
  })

  useEffect(() => {
    axios.get(`${BASE_URL}/sales/success-by-seller`)
    .then(response => {
       const data = response.data as SaleSuccess[]
       const mylabels = data.map(x => x.sellerName)
       const mySeries = data.map(x => round(100 * x.deals/x.visited, 1))

       setChartData({
        labels: {
          categories: mylabels
        },
        series: [
          {
            name: "% Success",
            data: mySeries
          }
        ]
      })
    })

  }, [])

  const options = {
    plotOptions: {
      bar: {
        horizontal: true,
      }
    },
  };

  return (
    <Chart
      options={{...options, xaxis: chartData.labels}}
      series = {chartData.series}
      type="bar"
      height="240"
    />
  );
}

export default BarChart;
